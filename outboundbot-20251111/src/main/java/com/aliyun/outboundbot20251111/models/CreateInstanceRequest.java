// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>The number of concurrent calls.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Concurrency")
    public Integer concurrency;

    /**
     * <p>The instance description.</p>
     * 
     * <strong>example:</strong>
     * <p>Intelligent outbound call instance for telemarketing scenarios</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>Intelligent outbound call instance</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The service mode.</p>
     * 
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("ServiceMode")
    public String serviceMode;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Integer getConcurrency() {
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

    public CreateInstanceRequest setServiceMode(String serviceMode) {
        this.serviceMode = serviceMode;
        return this;
    }
    public String getServiceMode() {
        return this.serviceMode;
    }

}
