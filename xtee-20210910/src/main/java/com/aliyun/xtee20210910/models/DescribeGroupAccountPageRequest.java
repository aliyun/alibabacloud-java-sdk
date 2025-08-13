// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeGroupAccountPageRequest extends TeaModel {
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
     * <p>Community number.</p>
     * 
     * <strong>example:</strong>
     * <p>129838420210118141502KiJ1SZL2</p>
     */
    @NameInMap("communityNo")
    public String communityNo;

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
     * <p>fieldKey.</p>
     * 
     * <strong>example:</strong>
     * <p>mobile</p>
     */
    @NameInMap("fieldKey")
    public String fieldKey;

    /**
     * <p>fieldVal.</p>
     * 
     * <strong>example:</strong>
     * <p>18000000000</p>
     */
    @NameInMap("fieldVal")
    public String fieldVal;

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
     * <p>6770764</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static DescribeGroupAccountPageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupAccountPageRequest self = new DescribeGroupAccountPageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupAccountPageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGroupAccountPageRequest setCommunityNo(String communityNo) {
        this.communityNo = communityNo;
        return this;
    }
    public String getCommunityNo() {
        return this.communityNo;
    }

    public DescribeGroupAccountPageRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeGroupAccountPageRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeGroupAccountPageRequest setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
        return this;
    }
    public String getFieldKey() {
        return this.fieldKey;
    }

    public DescribeGroupAccountPageRequest setFieldVal(String fieldVal) {
        this.fieldVal = fieldVal;
        return this;
    }
    public String getFieldVal() {
        return this.fieldVal;
    }

    public DescribeGroupAccountPageRequest setIsPage(Boolean isPage) {
        this.isPage = isPage;
        return this;
    }
    public Boolean getIsPage() {
        return this.isPage;
    }

    public DescribeGroupAccountPageRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeGroupAccountPageRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupAccountPageRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeGroupAccountPageRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
