// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StartLinkelinkflowLinkflowProcessRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("DefinitionKey")
    public String definitionKey;

    @NameInMap("Name")
    public String name;

    @NameInMap("Outcome")
    public String outcome;

    @NameInMap("Params")
    public String params;

    @NameInMap("StartUserId")
    public String startUserId;

    @NameInMap("TenantId")
    public String tenantId;

    public static StartLinkelinkflowLinkflowProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        StartLinkelinkflowLinkflowProcessRequest self = new StartLinkelinkflowLinkflowProcessRequest();
        return TeaModel.build(map, self);
    }

    public StartLinkelinkflowLinkflowProcessRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public StartLinkelinkflowLinkflowProcessRequest setDefinitionKey(String definitionKey) {
        this.definitionKey = definitionKey;
        return this;
    }
    public String getDefinitionKey() {
        return this.definitionKey;
    }

    public StartLinkelinkflowLinkflowProcessRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public StartLinkelinkflowLinkflowProcessRequest setOutcome(String outcome) {
        this.outcome = outcome;
        return this;
    }
    public String getOutcome() {
        return this.outcome;
    }

    public StartLinkelinkflowLinkflowProcessRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public StartLinkelinkflowLinkflowProcessRequest setStartUserId(String startUserId) {
        this.startUserId = startUserId;
        return this;
    }
    public String getStartUserId() {
        return this.startUserId;
    }

    public StartLinkelinkflowLinkflowProcessRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
