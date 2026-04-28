// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CreateInstanceInspectionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>i-2ze5ru5rjurix7f71sxv</p>
     */
    @NameInMap("instance")
    public String instance;

    @NameInMap("items")
    public java.util.List<String> items;

    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <strong>example:</strong>
     * <p>console</p>
     */
    @NameInMap("source")
    public String source;

    public static CreateInstanceInspectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceInspectionRequest self = new CreateInstanceInspectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceInspectionRequest setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public CreateInstanceInspectionRequest setItems(java.util.List<String> items) {
        this.items = items;
        return this;
    }
    public java.util.List<String> getItems() {
        return this.items;
    }

    public CreateInstanceInspectionRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateInstanceInspectionRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
