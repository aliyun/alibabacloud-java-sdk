// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCompressFileDetectResultRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paging query. Default value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The unique identifier of the file. This parameter is required in practice. If this parameter is not specified, the API returns ServerError(400). The value must be the MD5 or SHA-256 hash of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>0a212417e65c26ff133cfff28f6c****</p>
     */
    @NameInMap("HashKey")
    public String hashKey;

    /**
     * <p>The maximum number of entries per page in a paging query. Default value: 20.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>27.9.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static ListCompressFileDetectResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCompressFileDetectResultRequest self = new ListCompressFileDetectResultRequest();
        return TeaModel.build(map, self);
    }

    public ListCompressFileDetectResultRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCompressFileDetectResultRequest setHashKey(String hashKey) {
        this.hashKey = hashKey;
        return this;
    }
    public String getHashKey() {
        return this.hashKey;
    }

    public ListCompressFileDetectResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCompressFileDetectResultRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
