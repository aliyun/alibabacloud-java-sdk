// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class TriggerPlaybookRequest extends TeaModel {
    /**
     * <p>The input parameters of the playbook.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;input1&quot;: &quot;xx.xx.xx.xx&quot;,
     *     &quot;input2&quot;: &quot;7d&quot;
     * }</p>
     */
    @NameInMap("InputParam")
    public String inputParam;

    /**
     * <p>The playbook UUID.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> operation to query the playbook UUID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2a687089-d4dd-47d4-9709-xxxxxxxx</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    public static TriggerPlaybookRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerPlaybookRequest self = new TriggerPlaybookRequest();
        return TeaModel.build(map, self);
    }

    public TriggerPlaybookRequest setInputParam(String inputParam) {
        this.inputParam = inputParam;
        return this;
    }
    public String getInputParam() {
        return this.inputParam;
    }

    public TriggerPlaybookRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

}
