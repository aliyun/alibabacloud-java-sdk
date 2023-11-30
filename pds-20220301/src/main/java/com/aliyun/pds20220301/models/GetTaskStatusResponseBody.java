// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetTaskStatusResponseBody extends TeaModel {
    /**
     * <p>The state of the task.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   running</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    : The task is</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    running</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    .</p>
     * <br>
     * <p>*   failed</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    : The task</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    fails</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    .</p>
     * <br>
     * <p>*   succeeded</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    : The task is</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    successful</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    .</p>
     */
    @NameInMap("status")
    public String status;

    public static GetTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStatusResponseBody self = new GetTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
