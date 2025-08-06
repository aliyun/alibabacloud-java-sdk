// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPageByCondAppInfoRequest extends TeaModel {
    @NameInMap("AppItemId")
    public String appItemId;

    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AppType")
    public Integer appType;

    /**
     * <strong>example:</strong>
     * <p>ShortVideo</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedTotalCount")
    public Boolean needTotalCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PkgName")
    public String pkgName;

    @NameInMap("PkgSignature")
    public String pkgSignature;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PlatformType")
    public Long platformType;

    @NameInMap("SortBy")
    public String sortBy;

    public static GetPageByCondAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPageByCondAppInfoRequest self = new GetPageByCondAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetPageByCondAppInfoRequest setAppItemId(String appItemId) {
        this.appItemId = appItemId;
        return this;
    }
    public String getAppItemId() {
        return this.appItemId;
    }

    public GetPageByCondAppInfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetPageByCondAppInfoRequest setAppType(Integer appType) {
        this.appType = appType;
        return this;
    }
    public Integer getAppType() {
        return this.appType;
    }

    public GetPageByCondAppInfoRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public GetPageByCondAppInfoRequest setNeedTotalCount(Boolean needTotalCount) {
        this.needTotalCount = needTotalCount;
        return this;
    }
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
    }

    public GetPageByCondAppInfoRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public GetPageByCondAppInfoRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetPageByCondAppInfoRequest setPkgName(String pkgName) {
        this.pkgName = pkgName;
        return this;
    }
    public String getPkgName() {
        return this.pkgName;
    }

    public GetPageByCondAppInfoRequest setPkgSignature(String pkgSignature) {
        this.pkgSignature = pkgSignature;
        return this;
    }
    public String getPkgSignature() {
        return this.pkgSignature;
    }

    public GetPageByCondAppInfoRequest setPlatformType(Long platformType) {
        this.platformType = platformType;
        return this;
    }
    public Long getPlatformType() {
        return this.platformType;
    }

    public GetPageByCondAppInfoRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
