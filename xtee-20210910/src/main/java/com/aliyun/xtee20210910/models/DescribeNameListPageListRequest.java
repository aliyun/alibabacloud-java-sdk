// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListPageListRequest extends TeaModel {
    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>The start time of the update period.</p>
     * 
     * <strong>example:</strong>
     * <p>1753372800000</p>
     */
    @NameInMap("updateBeginTime")
    public Long updateBeginTime;

    /**
     * <p>The end time of the update period.</p>
     * 
     * <strong>example:</strong>
     * <p>1753459199059</p>
     */
    @NameInMap("updateEndTime")
    public Long updateEndTime;

    /**
     * <p>The variable name or description.</p>
     * 
     * <strong>example:</strong>
     * <p>白名单</p>
     */
    @NameInMap("value")
    public String value;

    /**
     * <p>The variable ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>762</p>
     */
    @NameInMap("variableId")
    public Long variableId;

    public static DescribeNameListPageListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNameListPageListRequest self = new DescribeNameListPageListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNameListPageListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeNameListPageListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeNameListPageListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNameListPageListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeNameListPageListRequest setUpdateBeginTime(Long updateBeginTime) {
        this.updateBeginTime = updateBeginTime;
        return this;
    }
    public Long getUpdateBeginTime() {
        return this.updateBeginTime;
    }

    public DescribeNameListPageListRequest setUpdateEndTime(Long updateEndTime) {
        this.updateEndTime = updateEndTime;
        return this;
    }
    public Long getUpdateEndTime() {
        return this.updateEndTime;
    }

    public DescribeNameListPageListRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public DescribeNameListPageListRequest setVariableId(Long variableId) {
        this.variableId = variableId;
        return this;
    }
    public Long getVariableId() {
        return this.variableId;
    }

}
