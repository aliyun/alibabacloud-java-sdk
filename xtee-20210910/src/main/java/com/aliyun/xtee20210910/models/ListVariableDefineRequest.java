// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ListVariableDefineRequest extends TeaModel {
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
     * <p>Whether binding is allowed, default is ENABLE</p>
     * 
     * <strong>example:</strong>
     * <p>ENABLE</p>
     */
    @NameInMap("allowBind")
    public String allowBind;

    /**
     * <p>Charging mode</p>
     * 
     * <strong>example:</strong>
     * <p>FREE</p>
     */
    @NameInMap("chargingMode")
    public String chargingMode;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>Page size, default value is 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Paging identifier</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("paging")
    public String paging;

    /**
     * <p>Query content</p>
     * 
     * <strong>example:</strong>
     * <p>age</p>
     */
    @NameInMap("queryContent")
    public String queryContent;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Authorization type</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("roleType")
    public String roleType;

    /**
     * <p>Scenario</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;EVENT_ACTION\&quot;]</p>
     */
    @NameInMap("scenesStr")
    public String scenesStr;

    /**
     * <p>Source</p>
     * 
     * <strong>example:</strong>
     * <p>SAF</p>
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
     * <p>变量的title</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>Type</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;IDENTIFY_SERVICE\&quot;]</p>
     */
    @NameInMap("typesStr")
    public String typesStr;

    public static ListVariableDefineRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVariableDefineRequest self = new ListVariableDefineRequest();
        return TeaModel.build(map, self);
    }

    public ListVariableDefineRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListVariableDefineRequest setAllowBind(String allowBind) {
        this.allowBind = allowBind;
        return this;
    }
    public String getAllowBind() {
        return this.allowBind;
    }

    public ListVariableDefineRequest setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }
    public String getChargingMode() {
        return this.chargingMode;
    }

    public ListVariableDefineRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListVariableDefineRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVariableDefineRequest setPaging(String paging) {
        this.paging = paging;
        return this;
    }
    public String getPaging() {
        return this.paging;
    }

    public ListVariableDefineRequest setQueryContent(String queryContent) {
        this.queryContent = queryContent;
        return this;
    }
    public String getQueryContent() {
        return this.queryContent;
    }

    public ListVariableDefineRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public ListVariableDefineRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

    public ListVariableDefineRequest setScenesStr(String scenesStr) {
        this.scenesStr = scenesStr;
        return this;
    }
    public String getScenesStr() {
        return this.scenesStr;
    }

    public ListVariableDefineRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListVariableDefineRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListVariableDefineRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ListVariableDefineRequest setTypesStr(String typesStr) {
        this.typesStr = typesStr;
        return this;
    }
    public String getTypesStr() {
        return this.typesStr;
    }

}
