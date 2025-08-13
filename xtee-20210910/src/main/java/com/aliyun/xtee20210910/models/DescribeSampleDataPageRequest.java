// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleDataPageRequest extends TeaModel {
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
    public Integer currentPage;

    /**
     * <p>Content of the list entered in the text box</p>
     * 
     * <strong>example:</strong>
     * <p>1770000000</p>
     */
    @NameInMap("dataValue")
    public String dataValue;

    /**
     * <p>Page size, default value is 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Start time</p>
     * 
     * <strong>example:</strong>
     * <p>1730429469000</p>
     */
    @NameInMap("updateBeginTime")
    public Long updateBeginTime;

    /**
     * <p>End time</p>
     * 
     * <strong>example:</strong>
     * <p>1730429469000</p>
     */
    @NameInMap("updateEndTime")
    public Long updateEndTime;

    public static DescribeSampleDataPageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleDataPageRequest self = new DescribeSampleDataPageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSampleDataPageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSampleDataPageRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSampleDataPageRequest setDataValue(String dataValue) {
        this.dataValue = dataValue;
        return this;
    }
    public String getDataValue() {
        return this.dataValue;
    }

    public DescribeSampleDataPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSampleDataPageRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeSampleDataPageRequest setUpdateBeginTime(Long updateBeginTime) {
        this.updateBeginTime = updateBeginTime;
        return this;
    }
    public Long getUpdateBeginTime() {
        return this.updateBeginTime;
    }

    public DescribeSampleDataPageRequest setUpdateEndTime(Long updateEndTime) {
        this.updateEndTime = updateEndTime;
        return this;
    }
    public Long getUpdateEndTime() {
        return this.updateEndTime;
    }

}
