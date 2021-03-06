/*
 * #%L
 * Maven Integration for Eclipse CDT
 * %%
 * Copyright (C) 2014 Stephen Edwards
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.github.sdedwards.m2e_nar.internal.cdt;

import org.eclipse.cdt.core.settings.model.ICConfigurationDescription;
import org.eclipse.core.runtime.CoreException;

import com.github.sdedwards.m2e_nar.internal.model.NarBuildArtifact;

public interface SettingsSynchroniser {

	public void fullSync(ICConfigurationDescription cfg, NarBuildArtifact artifactSettings) throws CoreException;

	public void pathsOnlySync(ICConfigurationDescription cfg, NarBuildArtifact artifactSettings) throws CoreException;

}
