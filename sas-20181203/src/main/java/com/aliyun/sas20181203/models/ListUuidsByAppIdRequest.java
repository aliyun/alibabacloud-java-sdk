// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUuidsByAppIdRequest extends TeaModel {
    /**
     * <p>The ID of the SAE application.</p>
     * 
     * <strong>example:</strong>
     * <p>5b41f4bf-349f-4263-89b1-9234c034****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AppRegionId")
    public String appRegionId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The UID of the resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ResourceDirectoryUid")
    public Long resourceDirectoryUid;

    public static ListUuidsByAppIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUuidsByAppIdRequest self = new ListUuidsByAppIdRequest();
        return TeaModel.build(map, self);
    }

    public ListUuidsByAppIdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListUuidsByAppIdRequest setAppRegionId(String appRegionId) {
        this.appRegionId = appRegionId;
        return this;
    }
    public String getAppRegionId() {
        return this.appRegionId;
    }

    public ListUuidsByAppIdRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUuidsByAppIdRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListUuidsByAppIdRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUuidsByAppIdRequest setResourceDirectoryUid(Long resourceDirectoryUid) {
        this.resourceDirectoryUid = resourceDirectoryUid;
        return this;
    }
    public Long getResourceDirectoryUid() {
        return this.resourceDirectoryUid;
    }

}
