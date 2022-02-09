// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeEndpointSchemaObjectsViaWildcardRequest extends TeaModel {
    @NameInMap("Current")
    public String current;

    @NameInMap("Id")
    public String id;

    @NameInMap("Previous")
    public String previous;

    public static DescribeEndpointSchemaObjectsViaWildcardRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndpointSchemaObjectsViaWildcardRequest self = new DescribeEndpointSchemaObjectsViaWildcardRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEndpointSchemaObjectsViaWildcardRequest setCurrent(String current) {
        this.current = current;
        return this;
    }
    public String getCurrent() {
        return this.current;
    }

    public DescribeEndpointSchemaObjectsViaWildcardRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeEndpointSchemaObjectsViaWildcardRequest setPrevious(String previous) {
        this.previous = previous;
        return this;
    }
    public String getPrevious() {
        return this.previous;
    }

}
