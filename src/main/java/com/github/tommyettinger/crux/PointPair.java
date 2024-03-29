/*******************************************************************************
 * Copyright 2014 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.github.tommyettinger.crux;

/** A {@code PointPair} is made up of two points in order. It can represent a ray, where {@code a} is the start and
 * {@code b} is the direction the ray points in. It can also represent a collision, where {@code a} is the collision
 * point and {@code b} is the normal vector.
 *
 * @param <P> Type of point (can be 2D/3D, int-based/float-based), implementing the {@link PointN} interface
 *
 * @author davebaol */
public class PointPair<P extends PointN<P>> {

	/** The starting point of a ray or the collision point of a collision. Never null. */
	public P a;

	/** The ending point of a ray or the normal vector of a collision. Never null. */
	public P b;

	/** Creates a {@code PointPair} with the given {@code start} and {@code end} points.
	 * @param start the starting point or collision point of this PointPair
	 * @param end the starting point or normal vector of this PointPair
	 */
	public PointPair(P start, P end) {
		this.a = start;
		this.b = end;
	}

	/** Sets this PointPair from the given PointPair.
	 * @param ray The PointPair
	 * @return this PointPair for chaining. */
	public PointPair<P> set (PointPair<P> ray) {
		a = a.set(ray.a);
		b = b.set(ray.b);
		return this;
	}

	/** Sets this PointPair from the given start and end points.
	 * @param start the starting point or collision point of this PointPair
	 * @param end the starting point or normal vector of this PointPair
	 * @return this PointPair for chaining. */
	public PointPair<P> set (P start, P end) {
		a = a.set(start);
		b = b.set(end);
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		PointPair<?> pointPair = (PointPair<?>) o;

		if (!a.equals(pointPair.a)) return false;
		return b.equals(pointPair.b);
	}

	@Override
	public int hashCode() {
		int result = a.hashCode();
		result = 31 * result + b.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "{a " + a + " to b " + b + '}';
	}
}
