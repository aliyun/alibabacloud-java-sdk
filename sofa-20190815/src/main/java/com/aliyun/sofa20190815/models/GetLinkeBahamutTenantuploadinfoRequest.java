// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutTenantuploadinfoRequest extends TeaModel {
    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("Folder")
    public String folder;

    @NameInMap("TenantPath")
    public String tenantPath;

    public static GetLinkeBahamutTenantuploadinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutTenantuploadinfoRequest self = new GetLinkeBahamutTenantuploadinfoRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutTenantuploadinfoRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public GetLinkeBahamutTenantuploadinfoRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetLinkeBahamutTenantuploadinfoRequest setFolder(String folder) {
        this.folder = folder;
        return this;
    }
    public String getFolder() {
        return this.folder;
    }

    public GetLinkeBahamutTenantuploadinfoRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
