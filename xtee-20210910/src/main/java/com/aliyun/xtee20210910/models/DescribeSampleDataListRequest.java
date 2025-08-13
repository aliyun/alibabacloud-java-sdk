// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleDataListRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values: </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public String currentPage;

    /**
     * <p>Deletion status</p>
     * 
     * <strong>example:</strong>
     * <p>DELETE</p>
     */
    @NameInMap("deleteTag")
    public String deleteTag;

    /**
     * <p>Page size, default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>Query content</p>
     * 
     * <strong>example:</strong>
     * <p>手机号</p>
     */
    @NameInMap("queryContent")
    public String queryContent;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Sample ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5467</p>
     */
    @NameInMap("sampleId")
    public Long sampleId;

    /**
     * <p>Scene</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("scene")
    public String scene;

    /**
     * <p>Status.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATE</p>
     */
    @NameInMap("status")
    public String status;

    public static DescribeSampleDataListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleDataListRequest self = new DescribeSampleDataListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSampleDataListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSampleDataListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSampleDataListRequest setDeleteTag(String deleteTag) {
        this.deleteTag = deleteTag;
        return this;
    }
    public String getDeleteTag() {
        return this.deleteTag;
    }

    public DescribeSampleDataListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeSampleDataListRequest setQueryContent(String queryContent) {
        this.queryContent = queryContent;
        return this;
    }
    public String getQueryContent() {
        return this.queryContent;
    }

    public DescribeSampleDataListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeSampleDataListRequest setSampleId(Long sampleId) {
        this.sampleId = sampleId;
        return this;
    }
    public Long getSampleId() {
        return this.sampleId;
    }

    public DescribeSampleDataListRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public DescribeSampleDataListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
