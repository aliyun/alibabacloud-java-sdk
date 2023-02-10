// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CheckQuaraFileIdRequest extends TeaModel {
    /**
     * <p>The IDs of quarantined files that you want to check.</p>
     * <br>
     * <p>>  You can call the [DescribeSuspEventQuaraFiles](~~DescribeSuspEventQuaraFiles~~) operation to query the IDs of quarantined files.</p>
     */
    @NameInMap("QuaraFileIds")
    public java.util.List<String> quaraFileIds;

    /**
     * <p>The UUID of the server on which you want to check quarantined files.</p>
     * <br>
     * <p>>  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static CheckQuaraFileIdRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckQuaraFileIdRequest self = new CheckQuaraFileIdRequest();
        return TeaModel.build(map, self);
    }

    public CheckQuaraFileIdRequest setQuaraFileIds(java.util.List<String> quaraFileIds) {
        this.quaraFileIds = quaraFileIds;
        return this;
    }
    public java.util.List<String> getQuaraFileIds() {
        return this.quaraFileIds;
    }

    public CheckQuaraFileIdRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
