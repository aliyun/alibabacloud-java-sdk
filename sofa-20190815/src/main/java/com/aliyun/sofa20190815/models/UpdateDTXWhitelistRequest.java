// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateDTXWhitelistRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsElastic")
    public Long isElastic;

    @NameInMap("IsLoadTest")
    public Long isLoadTest;

    @NameInMap("LogicalDsName")
    public String logicalDsName;

    public static UpdateDTXWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDTXWhitelistRequest self = new UpdateDTXWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDTXWhitelistRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateDTXWhitelistRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public UpdateDTXWhitelistRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateDTXWhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDTXWhitelistRequest setIsElastic(Long isElastic) {
        this.isElastic = isElastic;
        return this;
    }
    public Long getIsElastic() {
        return this.isElastic;
    }

    public UpdateDTXWhitelistRequest setIsLoadTest(Long isLoadTest) {
        this.isLoadTest = isLoadTest;
        return this;
    }
    public Long getIsLoadTest() {
        return this.isLoadTest;
    }

    public UpdateDTXWhitelistRequest setLogicalDsName(String logicalDsName) {
        this.logicalDsName = logicalDsName;
        return this;
    }
    public String getLogicalDsName() {
        return this.logicalDsName;
    }

}
