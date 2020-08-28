// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodUserDomainsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DomainStatus")
    public String domainStatus;

    @NameInMap("DomainSearchType")
    public String domainSearchType;

    @NameInMap("CdnType")
    public String cdnType;

    @NameInMap("CheckDomainShow")
    public Boolean checkDomainShow;

    @NameInMap("FuncId")
    public String funcId;

    @NameInMap("FuncFilter")
    public String funcFilter;

    public static DescribeVodUserDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodUserDomainsRequest self = new DescribeVodUserDomainsRequest();
        return TeaModel.build(map, self);
    }

}
