// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdatePersonalICodeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>685072a0-1fd5-40ef-ae6b-cf94e79e718f</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The AK model.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *         &quot;icode&quot;: &quot;V2Yc/dMFWBwTKLNCNxgnN<em><em><strong>z</strong></em>5ARu&quot;,
     *         &quot;icodeKey&quot;: &quot;b6f3</em>**32a62936&quot;,
     *         &quot;type&quot;: 1
     *     }</p>
     */
    @NameInMap("Result")
    public UpdatePersonalICodeResponseBodyResult result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdatePersonalICodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePersonalICodeResponseBody self = new UpdatePersonalICodeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePersonalICodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePersonalICodeResponseBody setResult(UpdatePersonalICodeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdatePersonalICodeResponseBodyResult getResult() {
        return this.result;
    }

    public UpdatePersonalICodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdatePersonalICodeResponseBodyResult extends TeaModel {
        /**
         * <p>SK</p>
         * 
         * <strong>example:</strong>
         * <p>V2Yc/dMFWBwTKLNCNxgnN*<em><strong>z</strong></em>5ARu</p>
         */
        @NameInMap("Icode")
        public String icode;

        /**
         * <p>AK</p>
         * 
         * <strong>example:</strong>
         * <p>b6f3***32a62936</p>
         */
        @NameInMap("IcodeKey")
        public String icodeKey;

        /**
         * <p>The AK type. Currently, only the value 1 is supported, which indicates a personal AK.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static UpdatePersonalICodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdatePersonalICodeResponseBodyResult self = new UpdatePersonalICodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdatePersonalICodeResponseBodyResult setIcode(String icode) {
            this.icode = icode;
            return this;
        }
        public String getIcode() {
            return this.icode;
        }

        public UpdatePersonalICodeResponseBodyResult setIcodeKey(String icodeKey) {
            this.icodeKey = icodeKey;
            return this;
        }
        public String getIcodeKey() {
            return this.icodeKey;
        }

        public UpdatePersonalICodeResponseBodyResult setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
