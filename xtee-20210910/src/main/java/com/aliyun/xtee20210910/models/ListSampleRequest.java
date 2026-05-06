// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ListSampleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <strong>example:</strong>
     * <p>SampleTest</p>
     */
    @NameInMap("SampleName")
    public String sampleName;

    /**
     * <strong>example:</strong>
     * <p>FINANCE</p>
     */
    @NameInMap("Tab")
    public String tab;

    /**
     * <strong>example:</strong>
     * <p>SAF_CONSOLE</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>2023-03-09 14:45:26</p>
     */
    @NameInMap("UploadTimeEnd")
    public String uploadTimeEnd;

    /**
     * <strong>example:</strong>
     * <p>2023-03-09 14:45:23</p>
     */
    @NameInMap("UploadTimeStart")
    public String uploadTimeStart;

    public static ListSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSampleRequest self = new ListSampleRequest();
        return TeaModel.build(map, self);
    }

    public ListSampleRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListSampleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListSampleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSampleRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public ListSampleRequest setSampleName(String sampleName) {
        this.sampleName = sampleName;
        return this;
    }
    public String getSampleName() {
        return this.sampleName;
    }

    public ListSampleRequest setTab(String tab) {
        this.tab = tab;
        return this;
    }
    public String getTab() {
        return this.tab;
    }

    public ListSampleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListSampleRequest setUploadTimeEnd(String uploadTimeEnd) {
        this.uploadTimeEnd = uploadTimeEnd;
        return this;
    }
    public String getUploadTimeEnd() {
        return this.uploadTimeEnd;
    }

    public ListSampleRequest setUploadTimeStart(String uploadTimeStart) {
        this.uploadTimeStart = uploadTimeStart;
        return this;
    }
    public String getUploadTimeStart() {
        return this.uploadTimeStart;
    }

}
