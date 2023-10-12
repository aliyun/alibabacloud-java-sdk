// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListDiagnosticsRequest extends TeaModel {
    @NameInMap("DiagnosticKey")
    public String diagnosticKey;

    @NameInMap("DiagnosticProduct")
    public String diagnosticProduct;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

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
