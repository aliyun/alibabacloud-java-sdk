// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarRecordInOutputRequest extends TeaModel {
    /**
     * <p>The UUID of the component action.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeSoarTaskAndActions~~">DescribeSoarTaskAndActions</a> API to get this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0531ff66-dd05-4f24-84bf-xxxxxxxx</p>
     */
    @NameInMap("ActionUuid")
    public String actionUuid;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeSoarRecordInOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarRecordInOutputRequest self = new DescribeSoarRecordInOutputRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSoarRecordInOutputRequest setActionUuid(String actionUuid) {
        this.actionUuid = actionUuid;
        return this;
    }
    public String getActionUuid() {
        return this.actionUuid;
    }

    public DescribeSoarRecordInOutputRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
