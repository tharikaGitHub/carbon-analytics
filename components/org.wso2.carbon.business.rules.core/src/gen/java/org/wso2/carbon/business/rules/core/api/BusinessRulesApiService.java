/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.business.rules.core.api;

import org.wso2.msf4j.Request;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaMSF4JServerCodegen",
        date = "2017-10-13T06:19:32.032Z")
public abstract class BusinessRulesApiService {
    public abstract Response createBusinessRule(Request request, String businessRule
            , Boolean deploy
    ) throws NotFoundException;

    public abstract Response deleteBusinessRule(Request request, String businessRuleInstanceID
            , Boolean forceDelete
    ) throws NotFoundException;

    public abstract Response getBusinessRules(Request request) throws NotFoundException;

    public abstract Response getRuleTemplate(Request request, String templateGroupID
            , String ruleTemplateID
    ) throws NotFoundException;

    public abstract Response getRuleTemplates(Request request, String templateGroupID
    ) throws NotFoundException;

    public abstract Response getTemplateGroup(Request request, String templateGroupID
    ) throws NotFoundException;

    public abstract Response getTemplateGroups(Request request) throws NotFoundException;

    public abstract Response loadBusinessRule(Request request, String businessRuleInstanceID
    ) throws NotFoundException;

    public abstract Response loadDeploymentInfo(Request request, String businessRuleInstanceID
    ) throws NotFoundException;

    public abstract Response redeployBusinessRule(Request request, String businessRuleInstanceID
    ) throws NotFoundException;

    public abstract Response updateBusinessRule(Request request, Object businessRule
            , String businessRuleInstanceID, Boolean deploy
    ) throws NotFoundException;
}
