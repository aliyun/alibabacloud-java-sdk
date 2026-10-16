// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeleteAccountResponseBody extends TeaModel {
    /**
     * <p>The deletion type. Valid values:</p>
     * <ul>
     * <li>0: Direct deletion. If the member has no pay-as-you-go resources in the last 30 days, the system directly deletes the member.</li>
     * <li>1: Cool-down period deletion. If the member has pay-as-you-go resources in the last 30 days, the member enters a cool-down period. The system starts to delete the member after the cool-down period ends. For more information about the cool-down period, see <a href="https://help.aliyun.com/document_detail/446079.html">What is the cool-down period for member deletion</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DeletionType")
    public String deletionType;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>009429F8-C1C0-5872-B674-A6C2333B9647</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccountResponseBody self = new DeleteAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAccountResponseBody setDeletionType(String deletionType) {
        this.deletionType = deletionType;
        return this;
    }
    public String getDeletionType() {
        return this.deletionType;
    }

    public DeleteAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
