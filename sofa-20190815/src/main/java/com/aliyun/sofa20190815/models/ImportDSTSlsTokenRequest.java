// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportDSTSlsTokenRequest extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("State")
    public String state;

    public static ImportDSTSlsTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDSTSlsTokenRequest self = new ImportDSTSlsTokenRequest();
        return TeaModel.build(map, self);
    }

    public ImportDSTSlsTokenRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportDSTSlsTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ImportDSTSlsTokenRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public ImportDSTSlsTokenRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
