// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVariableListRequest extends TeaModel {
    /**
     * <p>Set the language type for requests and responses, default value is <strong>zh</strong>. Values: </p>
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
     * <p>Creation type.</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("createType")
    public String createType;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public String currentPage;

    /**
     * <p>Page size, default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>Associated event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>de_avypfd8253</p>
     */
    @NameInMap("refObjId")
    public String refObjId;

    /**
     * <p>Region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Source type.</p>
     * 
     * <strong>example:</strong>
     * <p>SAF</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>Type.</p>
     * 
     * <strong>example:</strong>
     * <p>IDENTIFY_SERVICE</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>JSON array string of types.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;coupon_abuse_detection\&quot;]</p>
     */
    @NameInMap("typesStr")
    public String typesStr;

    /**
     * <p>Value for fuzzy search.</p>
     * 
     * <strong>example:</strong>
     * <p>注册</p>
     */
    @NameInMap("value")
    public String value;

    public static DescribeVariableListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVariableListRequest self = new DescribeVariableListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVariableListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVariableListRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public DescribeVariableListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVariableListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeVariableListRequest setRefObjId(String refObjId) {
        this.refObjId = refObjId;
        return this;
    }
    public String getRefObjId() {
        return this.refObjId;
    }

    public DescribeVariableListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeVariableListRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DescribeVariableListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeVariableListRequest setTypesStr(String typesStr) {
        this.typesStr = typesStr;
        return this;
    }
    public String getTypesStr() {
        return this.typesStr;
    }

    public DescribeVariableListRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
