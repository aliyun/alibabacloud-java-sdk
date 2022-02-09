// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsEndpointSchemaObjectsRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("Schema")
    public String schema;

    public static DescribeOmsEndpointSchemaObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsEndpointSchemaObjectsRequest self = new DescribeOmsEndpointSchemaObjectsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOmsEndpointSchemaObjectsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeOmsEndpointSchemaObjectsRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public DescribeOmsEndpointSchemaObjectsRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

}
