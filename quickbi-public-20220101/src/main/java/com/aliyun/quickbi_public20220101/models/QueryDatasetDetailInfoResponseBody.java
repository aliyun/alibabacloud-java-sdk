// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDatasetDetailInfoResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DC4E1E63-B337-44F8-8C22-6F00DF67E2C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The dataset data returned in JSON format:
     * <code>{ &quot;cube&quot;: { &quot;dimensions&quot;: [ { &quot;caption&quot;: &quot;Customer name&quot;, &quot;dataType&quot;: &quot;string&quot;, &quot;dimensionType&quot;: &quot;standard_dimension&quot;, &quot;factColumn&quot;: &quot;customer_name&quot;, &quot;uid&quot;: &quot;N5820f5_customer_name&quot; }, { &quot;caption&quot;: &quot;Order number&quot;, &quot;dataType&quot;: &quot;string&quot;, &quot;dimensionType&quot;: &quot;standard_dimension&quot;, &quot;factColumn&quot;: &quot;order_id&quot;, &quot;uid&quot;: &quot;N5820f5_order_id&quot; } ], &quot;measures&quot;: [ { &quot;caption&quot;: &quot;Order amount&quot;, &quot;dataType&quot;: &quot;number&quot;, &quot;factColumn&quot;: &quot;order_amt&quot;, &quot;measureType&quot;: &quot;standard_measure&quot;, &quot;uid&quot;: &quot;N5820f5_order_amt&quot; } ], &quot;table&quot;: { &quot;customsql&quot;: false, &quot;dsId&quot;: &quot;261b252d-c3c3-498a-a0a7-5d1ec6cd****&quot;, &quot;tableName&quot;: &quot;company_sales_record_copy&quot; } }, &quot;datasetId&quot;: &quot;5820f58c-c734-4d8a-baf1-7979af4f****&quot;, &quot;datasetName&quot;: &quot;company_sales_record_copy12&quot;, &quot;datasource&quot;: { &quot;dsId&quot;: &quot;261b252d-c3c3-498a-a0a7-5d1ec6cd****&quot;, &quot;dsName&quot;: &quot;Lisan personal use&quot;, &quot;dsType&quot;: &quot;mysql&quot; }, &quot;directory&quot;: { &quot;id&quot;: &quot;schemaad8aad00-9c55-4984-a767-b4e0ec60****&quot;, &quot;name&quot;: &quot;My datasets&quot;, &quot;pathId&quot;: &quot;schemaad8aad00-9c55-4984-a767-b4e0ec60****&quot;, &quot;pathName&quot;: &quot;My datasets&quot; }, &quot;ownerId&quot;: &quot;13651626232****&quot;, &quot;ownerName&quot;: &quot;Zhang San&quot;, &quot;rowLevel&quot;: false, &quot;workspaceId&quot;: &quot;95296e95-ca89-4c7d-8af9-dedf0ad0****&quot;, &quot;workspaceName&quot;: &quot;Test workspace&quot; }</code></p>
     * 
     * <strong>example:</strong>
     * <p>The dataset data returned in JSON format. For more information, see the description on the left</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p>Indicates whether the API operation is successful. Valid values:</p>
     * <ul>
     * <li>true: The operation is successful.</li>
     * <li>false: The operation fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDatasetDetailInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetDetailInfoResponseBody self = new QueryDatasetDetailInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDatasetDetailInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDatasetDetailInfoResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public QueryDatasetDetailInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
