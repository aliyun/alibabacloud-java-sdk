// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeMarkPageRequest extends TeaModel {
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
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public String currentPage;

    /**
     * <p>Order direction.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <p>Whether to paginate.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isPage")
    public Boolean isPage;

    /**
     * <p>Sorting condition.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("order")
    public String order;

    /**
     * <p>Page size, default value is 10.</p>
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
     * <p>443</p>
     */
    @NameInMap("taskLogId")
    public String taskLogId;

    public static DescribeMarkPageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMarkPageRequest self = new DescribeMarkPageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMarkPageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeMarkPageRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeMarkPageRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeMarkPageRequest setIsPage(Boolean isPage) {
        this.isPage = isPage;
        return this;
    }
    public Boolean getIsPage() {
        return this.isPage;
    }

    public DescribeMarkPageRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeMarkPageRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeMarkPageRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeMarkPageRequest setTaskLogId(String taskLogId) {
        this.taskLogId = taskLogId;
        return this;
    }
    public String getTaskLogId() {
        return this.taskLogId;
    }

}
