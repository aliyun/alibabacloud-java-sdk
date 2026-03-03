// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class Enterprise extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>121321412341</p>
     */
    @NameInMap("accountId")
    public String accountId;

    /**
     * <strong>example:</strong>
     * <p>互联网企业</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>linkedmall</p>
     */
    @NameInMap("identification")
    public String identification;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>内部</p>
     */
    @NameInMap("type")
    public String type;

    public static Enterprise build(java.util.Map<String, ?> map) throws Exception {
        Enterprise self = new Enterprise();
        return TeaModel.build(map, self);
    }

    public Enterprise setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public Enterprise setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Enterprise setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Enterprise setIdentification(String identification) {
        this.identification = identification;
        return this;
    }
    public String getIdentification() {
        return this.identification;
    }

    public Enterprise setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Enterprise setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Enterprise setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
