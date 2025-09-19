// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAttackPathWhitelistRequest extends TeaModel {
    /**
     * <p>When performing a paginated query, set the current page number. The default value is <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language type for requests and responses. The default value is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>When performing a paginated query, set the maximum number of items per page. The default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Path name description.</p>
     * <blockquote>
     * <p>You can call <a href="~~ListAvailableAttackPath~~">ListAvailableAttackPath</a> to query the path name descriptions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ECS Instance Can Obtain Long-term Access Credential by Enabling Console Logon for RAM User</p>
     */
    @NameInMap("PathNameDesc")
    public String pathNameDesc;

    /**
     * <p>Path type.</p>
     * <blockquote>
     * <p>You can call <a href="~~ListAvailableAttackPath~~">ListAvailableAttackPath</a> to query the path types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>role_escalation</p>
     */
    @NameInMap("PathType")
    public String pathType;

    /**
     * <p>Whitelist name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("WhitelistName")
    public String whitelistName;

    public static ListAttackPathWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAttackPathWhitelistRequest self = new ListAttackPathWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public ListAttackPathWhitelistRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAttackPathWhitelistRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListAttackPathWhitelistRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAttackPathWhitelistRequest setPathNameDesc(String pathNameDesc) {
        this.pathNameDesc = pathNameDesc;
        return this;
    }
    public String getPathNameDesc() {
        return this.pathNameDesc;
    }

    public ListAttackPathWhitelistRequest setPathType(String pathType) {
        this.pathType = pathType;
        return this;
    }
    public String getPathType() {
        return this.pathType;
    }

    public ListAttackPathWhitelistRequest setWhitelistName(String whitelistName) {
        this.whitelistName = whitelistName;
        return this;
    }
    public String getWhitelistName() {
        return this.whitelistName;
    }

}
