// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupClientsRequest extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("SupportRegionId")
    public String supportRegionId;

    public static DescribeBackupClientsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupClientsRequest self = new DescribeBackupClientsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupClientsRequest setSupportRegionId(String supportRegionId) {
        this.supportRegionId = supportRegionId;
        return this;
    }
    public String getSupportRegionId() {
        return this.supportRegionId;
    }

}
