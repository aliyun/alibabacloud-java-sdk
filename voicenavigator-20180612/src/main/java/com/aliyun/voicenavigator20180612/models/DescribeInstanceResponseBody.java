// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    /**
     * <p>The instance ability type.<br>
     * DEFAULT: full abilities.<br>
     * VOICE_ONLY: only voice abilities, without dialog intervention.</p>
     * 
     * <strong>example:</strong>
     * <p>VOICE_ONLY</p>
     */
    @NameInMap("AbilityType")
    public String abilityType;

    /**
     * <p>The list of applicable operations.</p>
     */
    @NameInMap("ApplicableOperations")
    public java.util.List<String> applicableOperations;

    /**
     * <p>The instance concurrency.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Concurrency")
    public Long concurrency;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>导航测试实例描述信息</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cd6fc91bc13445c2af7f2e3e31418520</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>1683216000000</p>
     */
    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <p>The user who last updated the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2508711*******</p>
     */
    @NameInMap("ModifyUserName")
    public String modifyUserName;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>导航测试实例</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("NluServiceParamsJson")
    public String nluServiceParamsJson;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>790B5EA3-D251-1666-B1E0-4D1F4B33A592</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status.</p>
     * 
     * <strong>example:</strong>
     * <p>Published</p>
     */
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
