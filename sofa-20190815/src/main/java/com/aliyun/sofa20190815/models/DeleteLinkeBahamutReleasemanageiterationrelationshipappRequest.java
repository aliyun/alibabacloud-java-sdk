// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutReleasemanageiterationrelationshipappRequest extends TeaModel {
    @NameInMap("AppNameJsonStr")
    public String appNameJsonStr;

    @NameInMap("ReleaseExternalId")
    public String releaseExternalId;

    public static DeleteLinkeBahamutReleasemanageiterationrelationshipappRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutReleasemanageiterationrelationshipappRequest self = new DeleteLinkeBahamutReleasemanageiterationrelationshipappRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutReleasemanageiterationrelationshipappRequest setAppNameJsonStr(String appNameJsonStr) {
        this.appNameJsonStr = appNameJsonStr;
        return this;
    }
    public String getAppNameJsonStr() {
        return this.appNameJsonStr;
    }

    public DeleteLinkeBahamutReleasemanageiterationrelationshipappRequest setReleaseExternalId(String releaseExternalId) {
        this.releaseExternalId = releaseExternalId;
        return this;
    }
    public String getReleaseExternalId() {
        return this.releaseExternalId;
    }

}
