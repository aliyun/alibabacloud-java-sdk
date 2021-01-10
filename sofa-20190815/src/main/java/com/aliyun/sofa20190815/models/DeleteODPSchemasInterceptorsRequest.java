// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteODPSchemasInterceptorsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InterceptorName")
    public String interceptorName;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("ZdalproxyInstanceId")
    public String zdalproxyInstanceId;

    public static DeleteODPSchemasInterceptorsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteODPSchemasInterceptorsRequest self = new DeleteODPSchemasInterceptorsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteODPSchemasInterceptorsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteODPSchemasInterceptorsRequest setInterceptorName(String interceptorName) {
        this.interceptorName = interceptorName;
        return this;
    }
    public String getInterceptorName() {
        return this.interceptorName;
    }

    public DeleteODPSchemasInterceptorsRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public DeleteODPSchemasInterceptorsRequest setZdalproxyInstanceId(String zdalproxyInstanceId) {
        this.zdalproxyInstanceId = zdalproxyInstanceId;
        return this;
    }
    public String getZdalproxyInstanceId() {
        return this.zdalproxyInstanceId;
    }

}
