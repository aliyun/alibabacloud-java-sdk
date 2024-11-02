// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarTaskAndActionsRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response.</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese (default)</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The playbook UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>1077f2f9-25e8-42d9-bfdf-1528e1313f6d</p>
     */
    @NameInMap("RequestUuid")
    public String requestUuid;

    public static DescribeSoarTaskAndActionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarTaskAndActionsRequest self = new DescribeSoarTaskAndActionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSoarTaskAndActionsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSoarTaskAndActionsRequest setRequestUuid(String requestUuid) {
        this.requestUuid = requestUuid;
        return this;
    }
    public String getRequestUuid() {
        return this.requestUuid;
    }

}
