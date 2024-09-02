// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ValidateDataSourcesRequest extends TeaModel {
    /**
     * <p>The request parameter. For more information, see <a href="https://help.aliyun.com/document_detail/170005.html">DataSource</a>.</p>
     */
    @NameInMap("body")
    public DataSource body;

    public static ValidateDataSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateDataSourcesRequest self = new ValidateDataSourcesRequest();
        return TeaModel.build(map, self);
    }

    public ValidateDataSourcesRequest setBody(DataSource body) {
        this.body = body;
        return this;
    }
    public DataSource getBody() {
        return this.body;
    }

}
