// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVersionPageListRequest extends TeaModel {
    /**
     * <p>Sets the language type for the request and response messages, with a default value of <strong>zh</strong>. Values: </p>
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
     * <p>Maximum number of results to be read in this call, with a default value of 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Used to mark the starting position for reading. An empty value indicates starting from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>Name of the variable.</p>
     * 
     * <strong>example:</strong>
     * <p>ex_OERlw0Zqfb23</p>
     */
    @NameInMap("objectCode")
    public String objectCode;

    /**
     * <p>Primary key ID of the variable.</p>
     * 
     * <strong>example:</strong>
     * <p>392023</p>
     */
    @NameInMap("objectId")
    public Long objectId;

    /**
     * <p>Number of items per page, with a default value of 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Pagination flag, with a default value of true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("paging")
    public Boolean paging;

    /**
     * <p>Region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Type.</p>
     * 
     * <strong>example:</strong>
     * <p>EXPRESSION</p>
     */
    @NameInMap("type")
    public String type;

    public static DescribeVersionPageListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVersionPageListRequest self = new DescribeVersionPageListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVersionPageListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVersionPageListRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeVersionPageListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeVersionPageListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVersionPageListRequest setObjectCode(String objectCode) {
        this.objectCode = objectCode;
        return this;
    }
    public String getObjectCode() {
        return this.objectCode;
    }

    public DescribeVersionPageListRequest setObjectId(Long objectId) {
        this.objectId = objectId;
        return this;
    }
    public Long getObjectId() {
        return this.objectId;
    }

    public DescribeVersionPageListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVersionPageListRequest setPaging(Boolean paging) {
        this.paging = paging;
        return this;
    }
    public Boolean getPaging() {
        return this.paging;
    }

    public DescribeVersionPageListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeVersionPageListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
