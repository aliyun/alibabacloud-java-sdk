// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeSlaTemplateRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeSlaTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlaTemplateRequest self = new DescribeSlaTemplateRequest();
        return TeaModel.build(map, self);
    }

}
