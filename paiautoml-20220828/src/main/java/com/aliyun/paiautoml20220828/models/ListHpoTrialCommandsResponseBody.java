// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class ListHpoTrialCommandsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>INVALID_USER_OR_EXP</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of commands.</p>
     */
    @NameInMap("Commands")
    public java.util.List<ListHpoTrialCommandsResponseBodyCommands> commands;

    /**
     * <p>Extra error information.</p>
     */
    @NameInMap("Detail")
    public java.util.Map<String, String> detail;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Missing \&quot;user_id\&quot; in request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>071A904D-5A49-597F-9F69-81C7701D04AC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListHpoTrialCommandsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHpoTrialCommandsResponseBody self = new ListHpoTrialCommandsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHpoTrialCommandsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHpoTrialCommandsResponseBody setCommands(java.util.List<ListHpoTrialCommandsResponseBodyCommands> commands) {
        this.commands = commands;
        return this;
    }
    public java.util.List<ListHpoTrialCommandsResponseBodyCommands> getCommands() {
        return this.commands;
    }

    public ListHpoTrialCommandsResponseBody setDetail(java.util.Map<String, String> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.Map<String, String> getDetail() {
        return this.detail;
    }

    public ListHpoTrialCommandsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHpoTrialCommandsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHpoTrialCommandsResponseBodyCommands extends TeaModel {
        /**
         * <p>The command that you want to run.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc submit pytorch --name=test_nni_foo_bar</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The id of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The output of the above command</p>
         * 
         * <strong>example:</strong>
         * <p>dlc job submitted.</p>
         */
        @NameInMap("Output")
        public String output;

        public static ListHpoTrialCommandsResponseBodyCommands build(java.util.Map<String, ?> map) throws Exception {
            ListHpoTrialCommandsResponseBodyCommands self = new ListHpoTrialCommandsResponseBodyCommands();
            return TeaModel.build(map, self);
        }

        public ListHpoTrialCommandsResponseBodyCommands setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public ListHpoTrialCommandsResponseBodyCommands setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListHpoTrialCommandsResponseBodyCommands setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

}
