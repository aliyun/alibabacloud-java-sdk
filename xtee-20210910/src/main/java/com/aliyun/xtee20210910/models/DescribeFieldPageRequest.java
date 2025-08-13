// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeFieldPageRequest extends TeaModel {
    /**
     * <p>Set the language type for request and response messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Field classification</p>
     * 
     * <strong>example:</strong>
     * <p>REQUEST_PARAM</p>
     */
    @NameInMap("classify")
    public String classify;

    /**
     * <p>Query input parameter name or title</p>
     * 
     * <strong>example:</strong>
     * <p>age/年龄</p>
     */
    @NameInMap("condition")
    public String condition;

    /**
     * <p>Current page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public String currentPage;

    /**
     * <p>Field name</p>
     * 
     * <strong>example:</strong>
     * <p>age</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Number of items per page, default value is 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Field source</p>
     * 
     * <strong>example:</strong>
     * <p>DEFINE</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>Status.</p>
     * 
     * <strong>example:</strong>
     * <p>ENABLE</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>Title.</p>
     * 
     * <strong>example:</strong>
     * <p>年龄</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>Field type</p>
     * 
     * <strong>example:</strong>
     * <p>STRING</p>
     */
    @NameInMap("type")
    public String type;

    public static DescribeFieldPageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFieldPageRequest self = new DescribeFieldPageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFieldPageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeFieldPageRequest setClassify(String classify) {
        this.classify = classify;
        return this;
    }
    public String getClassify() {
        return this.classify;
    }

    public DescribeFieldPageRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public DescribeFieldPageRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeFieldPageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeFieldPageRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeFieldPageRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeFieldPageRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeFieldPageRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeFieldPageRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public DescribeFieldPageRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
