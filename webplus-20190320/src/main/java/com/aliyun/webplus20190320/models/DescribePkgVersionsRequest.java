// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribePkgVersionsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PkgVersionLabel")
    public String pkgVersionLabel;

    @NameInMap("PkgVersionSearch")
    public String pkgVersionSearch;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribePkgVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePkgVersionsRequest self = new DescribePkgVersionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePkgVersionsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribePkgVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePkgVersionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePkgVersionsRequest setPkgVersionLabel(String pkgVersionLabel) {
        this.pkgVersionLabel = pkgVersionLabel;
        return this;
    }
    public String getPkgVersionLabel() {
        return this.pkgVersionLabel;
    }

    public DescribePkgVersionsRequest setPkgVersionSearch(String pkgVersionSearch) {
        this.pkgVersionSearch = pkgVersionSearch;
        return this;
    }
    public String getPkgVersionSearch() {
        return this.pkgVersionSearch;
    }

    public DescribePkgVersionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
