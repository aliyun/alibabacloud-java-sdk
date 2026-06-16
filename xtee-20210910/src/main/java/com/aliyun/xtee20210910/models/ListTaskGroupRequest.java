// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ListTaskGroupRequest extends TeaModel {
    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language of the error message returned by the API. Valid values: zh: Chinese; en: English. The default value is en.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The area encoding.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <p>Sample name.</p>
     * 
     * <strong>example:</strong>
     * <p>TEst</p>
     */
    @NameInMap("SampleName")
    public String sampleName;

    /**
     * <p>Task group name.</p>
     * 
     * <strong>example:</strong>
     * <p>TeskGroupTest</p>
     */
    @NameInMap("TaskGroupName")
    public String taskGroupName;

    /**
     * <p>Access type.</p>
     * 
     * <strong>example:</strong>
     * <p>SAF_CONSOLE</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListTaskGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskGroupRequest self = new ListTaskGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskGroupRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListTaskGroupRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListTaskGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskGroupRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public ListTaskGroupRequest setSampleName(String sampleName) {
        this.sampleName = sampleName;
        return this;
    }
    public String getSampleName() {
        return this.sampleName;
    }

    public ListTaskGroupRequest setTaskGroupName(String taskGroupName) {
        this.taskGroupName = taskGroupName;
        return this;
    }
    public String getTaskGroupName() {
        return this.taskGroupName;
    }

    public ListTaskGroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
