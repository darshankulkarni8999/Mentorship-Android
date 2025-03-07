public class AdminActivity extends AppCompatActivity {

    private ListView mentorsListView;
    private LinearLayout mentorDetailsLayout;
    private TextView mentorNameTextView, mentorContactTextView;
    private Button editMentorButton, deleteMentorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        mentorsListView = findViewById(R.id.mentorsListView);
        mentorDetailsLayout = findViewById(R.id.mentorDetailsLayout);
        mentorNameTextView = findViewById(R.id.mentorNameTextView);
        mentorContactTextView = findViewById(R.id.mentorContactTextView);
        editMentorButton = findViewById(R.id.editMentorButton);
        deleteMentorButton = findViewById(R.id.deleteMentorButton);

        // Populate the list of mentors (you'll need to implement this)

        mentorsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // When a mentor is selected, show their details
                showMentorDetails();
            }
        });

        editMentorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle editing the selected mentor
            }
        });

        deleteMentorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle deleting the selected mentor
            }
        });
    }

    private void showMentorDetails() {
        // Populate mentor details and make the layout visible
        mentorNameTextView.setText("Mentor Name");
        mentorContactTextView.setText("Contact: (123) 456-7890");
        mentorDetailsLayout.setVisibility(View.VISIBLE);
    }
}
