// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaUtilizationReportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Adjustable")
    public Boolean adjustable;

    /**
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("KeyWords")
    public String keyWords;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjEwLCJvdHNOZXh0VG9rZW4iOiJDQUVTR3dvWkNoY0tFM1J2ZEdGc1gzVnpZV2RsWDNCbGNtTmxiblFRQVJnQkl1RUJDZ2tCQUFBQUFBQUFXVUFLMHdFRHpnQUFBREZUTXpFek9ETXdNemN6TnpNNE16VXpPVE0xTXpjek5qTXpNekV6TlRNNE16Z3VVek01TXpjek5UTTJOalkyTWpZeE16Y3laRFl5TmpJek16WXhNbVF6TkRNMk16RXpOREprTmpFek9UTTRNemN5WkRZMk16WTJORE16TXpVMk16TXhNemt6TURZMk16RXpNUzVUTmpFMk16YzBOamsyWmpabE56UTNNall4TmprMll5NVRNelkyTWpZMU16a3pPRE0yTmpRek1qSmtNekV6TlRNeU5qRXlaRE0wTXpFek1UWTJNbVEyTWpZME16TXpNVEprTXpNMk16WXlOalV6TkRNMU16VXpNalkwTXpVek1qTTMiLCJ0YXNrSWQiOiI5NzU2ZmJhNy1iYjNhLTQ2MTQtYTk4Ny1mNmQzNWMxOTBmMTEiLCJ1aWQiOiIxODA3Nzg1OTU3NjMxNTg4IiwidXRpbGl6YXRpb25TdGF0dXNlcyI6IiJ9</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <strong>example:</strong>
     * <p>CommonQuota</p>
     */
    @NameInMap("QuotaCategory")
    public String quotaCategory;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("QuotaRegionId")
    public String quotaRegionId;

    @NameInMap("UtilizationStatuses")
    public java.util.List<String> utilizationStatuses;

    public static ListQuotaUtilizationReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaUtilizationReportRequest self = new ListQuotaUtilizationReportRequest();
        return TeaModel.build(map, self);
    }

    public ListQuotaUtilizationReportRequest setAdjustable(Boolean adjustable) {
        this.adjustable = adjustable;
        return this;
    }
    public Boolean getAdjustable() {
        return this.adjustable;
    }

    public ListQuotaUtilizationReportRequest setKeyWords(String keyWords) {
        this.keyWords = keyWords;
        return this;
    }
    public String getKeyWords() {
        return this.keyWords;
    }

    public ListQuotaUtilizationReportRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListQuotaUtilizationReportRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListQuotaUtilizationReportRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListQuotaUtilizationReportRequest setQuotaCategory(String quotaCategory) {
        this.quotaCategory = quotaCategory;
        return this;
    }
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

    public ListQuotaUtilizationReportRequest setQuotaRegionId(String quotaRegionId) {
        this.quotaRegionId = quotaRegionId;
        return this;
    }
    public String getQuotaRegionId() {
        return this.quotaRegionId;
    }

    public ListQuotaUtilizationReportRequest setUtilizationStatuses(java.util.List<String> utilizationStatuses) {
        this.utilizationStatuses = utilizationStatuses;
        return this;
    }
    public java.util.List<String> getUtilizationStatuses() {
        return this.utilizationStatuses;
    }

}
