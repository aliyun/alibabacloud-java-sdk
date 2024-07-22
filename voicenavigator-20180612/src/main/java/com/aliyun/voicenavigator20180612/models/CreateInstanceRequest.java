// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Concurrency")
    public Long concurrency;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("NluServiceParamsJson")
    public String nluServiceParamsJson;

    @NameInMap("UnionInstanceId")
    public String unionInstanceId;

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
