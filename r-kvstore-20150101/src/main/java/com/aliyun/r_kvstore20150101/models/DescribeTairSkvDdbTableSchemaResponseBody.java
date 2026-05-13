// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairSkvDdbTableSchemaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A1604E1B-6825-1577-BBDA-2A64E8D5F126</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;attributeDefinitions&quot;:[{&quot;attributeType&quot;:&quot;S&quot;,&quot;attributeName&quot;:&quot;pk&quot;},{&quot;attributeType&quot;:&quot;S&quot;,&quot;attributeName&quot;:&quot;sk&quot;}],&quot;keySchema&quot;:[{&quot;attributeName&quot;:&quot;pk&quot;,&quot;keyType&quot;:&quot;HASH&quot;},{&quot;attributeName&quot;:&quot;sk&quot;,&quot;keyType&quot;:&quot;RANGE&quot;}]}</p>
     */
    @NameInMap("Schema")
    public String schema;

    /**
     * <strong>example:</strong>
     * <p>{&quot;attributeName&quot;:&quot;Expiretime&quot;,&quot;enabled&quot;:true}</p>
     */
    @NameInMap("TtlSpec")
    public String ttlSpec;

    public static DescribeTairSkvDdbTableSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairSkvDdbTableSchemaResponseBody self = new DescribeTairSkvDdbTableSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTairSkvDdbTableSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTairSkvDdbTableSchemaResponseBody setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public DescribeTairSkvDdbTableSchemaResponseBody setTtlSpec(String ttlSpec) {
        this.ttlSpec = ttlSpec;
        return this;
    }
    public String getTtlSpec() {
        return this.ttlSpec;
    }

}
