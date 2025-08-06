// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAppLicenseResponseBody extends TeaModel {
    @NameInMap("FailedLicenseItemIdList")
    public java.util.List<String> failedLicenseItemIdList;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAppLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppLicenseResponseBody self = new DeleteAppLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppLicenseResponseBody setFailedLicenseItemIdList(java.util.List<String> failedLicenseItemIdList) {
        this.failedLicenseItemIdList = failedLicenseItemIdList;
        return this;
    }
    public java.util.List<String> getFailedLicenseItemIdList() {
        return this.failedLicenseItemIdList;
    }

    public DeleteAppLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
