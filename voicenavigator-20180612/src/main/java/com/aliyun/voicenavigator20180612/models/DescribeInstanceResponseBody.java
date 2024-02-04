// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    @NameInMap("AbilityType")
    public String abilityType;

    @NameInMap("ApplicableOperations")
    public java.util.List<String> applicableOperations;

    @NameInMap("Concurrency")
    public Long concurrency;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ModifyTime")
    public Long modifyTime;

    @NameInMap("ModifyUserName")
    public String modifyUserName;

    @NameInMap("Name")
    public String name;

    @NameInMap("NluServiceParamsJson")
    public String nluServiceParamsJson;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("UnionInstanceId")
    public String unionInstanceId;

    @NameInMap("UnionSource")
    public String unionSource;

    public static DescribeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceResponseBody self = new DescribeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceResponseBody setAbilityType(String abilityType) {
        this.abilityType = abilityType;
        return this;
    }
    public String getAbilityType() {
        return this.abilityType;
    }

    public DescribeInstanceResponseBody setApplicableOperations(java.util.List<String> applicableOperations) {
        this.applicableOperations = applicableOperations;
        return this;
    }
    public java.util.List<String> getApplicableOperations() {
        return this.applicableOperations;
    }

    public DescribeInstanceResponseBody setConcurrency(Long concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Long getConcurrency() {
        return this.concurrency;
    }

    public DescribeInstanceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceResponseBody setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public DescribeInstanceResponseBody setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
        return this;
    }
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    public DescribeInstanceResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeInstanceResponseBody setNluServiceParamsJson(String nluServiceParamsJson) {
        this.nluServiceParamsJson = nluServiceParamsJson;
        return this;
    }
    public String getNluServiceParamsJson() {
        return this.nluServiceParamsJson;
    }

    public DescribeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeInstanceResponseBody setUnionInstanceId(String unionInstanceId) {
        this.unionInstanceId = unionInstanceId;
        return this;
    }
    public String getUnionInstanceId() {
        return this.unionInstanceId;
    }

    public DescribeInstanceResponseBody setUnionSource(String unionSource) {
        this.unionSource = unionSource;
        return this;
    }
    public String getUnionSource() {
        return this.unionSource;
    }

}
