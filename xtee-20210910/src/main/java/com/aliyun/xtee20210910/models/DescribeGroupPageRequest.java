// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeGroupPageRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and responses, with a default value of <strong>zh</strong>. Values:</p>
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
     * <p>Order.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <p>Sorting condition.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("order")
    public String order;

    /**
     * <p>Page size, with a default value of 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>Region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6770764</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <p>Time type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("timeType")
    public String timeType;

    public static DescribeGroupPageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupPageRequest self = new DescribeGroupPageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupPageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGroupPageRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeGroupPageRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeGroupPageRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeGroupPageRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupPageRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeGroupPageRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeGroupPageRequest setTimeType(String timeType) {
        this.timeType = timeType;
        return this;
    }
    public String getTimeType() {
        return this.timeType;
    }

}
