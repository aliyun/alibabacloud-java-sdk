// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteCustomBlockRecordRequest extends TeaModel {
    /**
     * <p>The ID of the IP address blocking policy.</p>
     * <br>
     * <p>> You can call the [DescribeCustomBlockRecords](~~DescribeCustomBlockRecords~~) operation to query the ID.</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteCustomBlockRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomBlockRecordRequest self = new DeleteCustomBlockRecordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomBlockRecordRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteCustomBlockRecordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
