// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeNodeUsedInfosResponseBody extends TeaModel {
    /**
     * <p>The node reference information. The value is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><p><strong>action</strong>: the referencing action. This field contains the following information:</p>
     * <ul>
     * <li><strong>name</strong>: the name of the referencing node.</li>
     * <li><strong>inputParams</strong>: the parameter settings of the referencing node.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;action&quot;: [
     *         {
     *             &quot;name&quot;: &quot;query_books&quot;,
     *             &quot;inputParams&quot;: [
     *                 {
     *                     &quot;referInfos&quot;: [
     *                         &quot;${play_group.datalist.*.ids}&quot;
     *                     ],
     *                     &quot;name&quot;: &quot;querySql&quot;
     *                 }
     *             ]
     *         }
     *     ]
     * }</p>
     */
    @NameInMap("NodeUsedInfos")
    public String nodeUsedInfos;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3B10F836-C2B1-54FA-AB59-7591B548FB59</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNodeUsedInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeUsedInfosResponseBody self = new DescribeNodeUsedInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNodeUsedInfosResponseBody setNodeUsedInfos(String nodeUsedInfos) {
        this.nodeUsedInfos = nodeUsedInfos;
        return this;
    }
    public String getNodeUsedInfos() {
        return this.nodeUsedInfos;
    }

    public DescribeNodeUsedInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
