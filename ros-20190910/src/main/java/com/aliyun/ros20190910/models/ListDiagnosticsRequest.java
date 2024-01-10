// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListDiagnosticsRequest extends TeaModel {
    /**
     * <p>The keyword in the diagnosis.</p>
     */
    @NameInMap("DiagnosticKey")
    public String diagnosticKey;

    /**
     * <p>The product that is diagnosed.</p>
     */
    @NameInMap("DiagnosticProduct")
    public String diagnosticProduct;

    /**
     * <p>The maximum number of results to be returned in a single call when NextToken is used for the query.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 50.</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The diagnosis status.</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListDiagnosticsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnosticsRequest self = new ListDiagnosticsRequest();
        return TeaModel.build(map, self);
    }

    public ListDiagnosticsRequest setDiagnosticKey(String diagnosticKey) {
        this.diagnosticKey = diagnosticKey;
        return this;
    }
    public String getDiagnosticKey() {
        return this.diagnosticKey;
    }

    public ListDiagnosticsRequest setDiagnosticProduct(String diagnosticProduct) {
        this.diagnosticProduct = diagnosticProduct;
        return this;
    }
    public String getDiagnosticProduct() {
        return this.diagnosticProduct;
    }

    public ListDiagnosticsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListDiagnosticsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDiagnosticsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
