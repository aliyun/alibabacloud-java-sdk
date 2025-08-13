// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleDataByBatchUUidPageRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Sample batch UUID</p>
     * 
     * <strong>example:</strong>
     * <p>203f1ae65c0a41a49dc4f8a47946caa2</p>
     */
    @NameInMap("batchUuid")
    public String batchUuid;

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
     * <p>1770000000,1770000001</p>
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
     * <p>1724986526000</p>
     */
    @NameInMap("updateBeginTime")
    public Long updateBeginTime;

    /**
     * <p>End time</p>
     * 
     * <strong>example:</strong>
     * <p>1724986526000</p>
     */
    @NameInMap("updateEndTime")
    public Long updateEndTime;

    public static DescribeSampleDataByBatchUUidPageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleDataByBatchUUidPageRequest self = new DescribeSampleDataByBatchUUidPageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSampleDataByBatchUUidPageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSampleDataByBatchUUidPageRequest setBatchUuid(String batchUuid) {
        this.batchUuid = batchUuid;
        return this;
    }
    public String getBatchUuid() {
        return this.batchUuid;
    }

    public DescribeSampleDataByBatchUUidPageRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSampleDataByBatchUUidPageRequest setDataValue(String dataValue) {
        this.dataValue = dataValue;
        return this;
    }
    public String getDataValue() {
        return this.dataValue;
    }

    public DescribeSampleDataByBatchUUidPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSampleDataByBatchUUidPageRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeSampleDataByBatchUUidPageRequest setUpdateBeginTime(Long updateBeginTime) {
        this.updateBeginTime = updateBeginTime;
        return this;
    }
    public Long getUpdateBeginTime() {
        return this.updateBeginTime;
    }

    public DescribeSampleDataByBatchUUidPageRequest setUpdateEndTime(Long updateEndTime) {
        this.updateEndTime = updateEndTime;
        return this;
    }
    public Long getUpdateEndTime() {
        return this.updateEndTime;
    }

}
