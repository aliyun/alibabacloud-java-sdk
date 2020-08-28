// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeForwardTableEntriesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ForwardTableId")
    @Validation(required = true)
    public String forwardTableId;

    @NameInMap("ForwardEntryId")
    public String forwardEntryId;

    @NameInMap("ExternalIp")
    public String externalIp;

    @NameInMap("ExternalPort")
    public String externalPort;

    @NameInMap("InternalIp")
    public String internalIp;

    @NameInMap("InternalPort")
    public String internalPort;

    @NameInMap("IpProtocol")
    public String ipProtocol;

    @NameInMap("ForwardEntryName")
    public String forwardEntryName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeForwardTableEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeForwardTableEntriesRequest self = new DescribeForwardTableEntriesRequest();
        return TeaModel.build(map, self);
    }

}
