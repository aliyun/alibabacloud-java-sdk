// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>The maximum concurrency of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Concurrency")
    public Long concurrency;

    /**
     * <p>The description of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一个测试场景</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the Voice Navigator instance, which identifies the digital employee scenario.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试场景</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Configuration parameters for the large language model service, in JSON format.</p>
     * <ul>
     * <li>Use this parameter to specify a Function Compute service.</li>
     * </ul>
     */
    @NameInMap("NluServiceParamsJson")
    public String nluServiceParamsJson;

    /**
     * <p>The ID of the source instance.</p>
     * <blockquote>
     * <p>If you set UnionSource to CCC, set this parameter to the ID of the Cloud Contact Center instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>demo-lctms</p>
     */
    @NameInMap("UnionInstanceId")
    public String unionInstanceId;

    /**
     * <p>The source service.</p>
     * <ul>
     * <li>CCC: Cloud Contact Center</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CCC</p>
     */
    @NameInMap("UnionSource")
    public String unionSource;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setConcurrency(Long concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Long getConcurrency() {
        return this.concurrency;
    }

    public CreateInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateInstanceRequest setNluServiceParamsJson(String nluServiceParamsJson) {
        this.nluServiceParamsJson = nluServiceParamsJson;
        return this;
    }
    public String getNluServiceParamsJson() {
        return this.nluServiceParamsJson;
    }

    public CreateInstanceRequest setUnionInstanceId(String unionInstanceId) {
        this.unionInstanceId = unionInstanceId;
        return this;
    }
    public String getUnionInstanceId() {
        return this.unionInstanceId;
    }

    public CreateInstanceRequest setUnionSource(String unionSource) {
        this.unionSource = unionSource;
        return this;
    }
    public String getUnionSource() {
        return this.unionSource;
    }

}
